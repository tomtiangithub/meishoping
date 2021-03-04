package com.meihong.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import com.meihong.entity.SysUser;
import com.meihong.http.HttpResult;
import com.meihong.security.JwtAuthenticatioToken;
import com.meihong.service.SysUserService;
import com.meihong.utils.PasswordUtils;
import com.meihong.utils.SecurityUtils;
import com.meihong.vo.LoginBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

/**
 * 登录控制器
 * @author
 * @date Jan 14, 2019
 */
/*@CrossOrigin(origins = "*", allowedHeaders = "*")*/
@RestController
public class SysLoginController {

	@Autowired
	private SysUserService sysUserService;
	@Autowired
	private AuthenticationManager authenticationManager;
	/**
	 * 登录接口
	 */
	@PostMapping(value = "xxxx/login")
	public HttpResult login(@RequestBody LoginBean loginBean, HttpServletRequest request) throws IOException {
		String username = loginBean.getAccount();
		String password = loginBean.getPassword();
		/*
		 * String captcha = loginBean.getCaptcha(); // 从session中获取之前保存的验证码跟前台传来的验证码进行匹配
		 * Object kaptcha =
		 * request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY); if(kaptcha
		 * == null){ return HttpResult.error("验证码已失效"); } if(!captcha.equals(kaptcha)){
		 * return HttpResult.error("验证码不正确"); }
		 */
		// 用户信息
		SysUser user = sysUserService.findByName(username);
		// 账号不存在、密码错误
		if (user == null) {
			return HttpResult.error("账号不存在");
		}
		if (!PasswordUtils.matches(user.getSalt(), password, user.getPassword())) {
			return HttpResult.error("密码不正确");
		}
		// 账号锁定
		if (user.getStatus() == 0) {
			return HttpResult.error("账号已被锁定,请联系管理员");
		}
		// 系统登录认证
		JwtAuthenticatioToken token = SecurityUtils.login(request, username, password, authenticationManager);
		return HttpResult.ok(token);
	}

}