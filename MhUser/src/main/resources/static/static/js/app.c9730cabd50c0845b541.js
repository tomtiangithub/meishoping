webpackJsonp([1],{"+cT6":function(t,e){},"55LG":function(t,e){},HKdZ:function(t,e){},NHnr:function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var n=a("/5sW"),s={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{attrs:{id:"tab-bar"}},[a("mt-tabbar",{directives:[{name:"show",rawName:"v-show",value:t.isShow,expression:"isShow"}],staticClass:"border-1px-top",attrs:{fixed:""},model:{value:t.selected,callback:function(e){t.selected=e},expression:"selected"}},[a("mt-tab-item",{attrs:{id:"main"}},[a("img",{attrs:{slot:"icon",src:t.img1},slot:"icon"}),t._v("首页\n    ")]),t._v(" "),a("mt-tab-item",{attrs:{id:"tool"}},[a("img",{attrs:{slot:"icon",src:t.img3},slot:"icon"}),t._v("应用中心\n    ")]),t._v(" "),a("mt-tab-item",{attrs:{id:"my"}},[a("img",{attrs:{slot:"icon",src:t.img5},slot:"icon"}),t._v("我的\n    ")])],1)],1)},staticRenderFns:[]};var i={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[a("mt-index-list",t._l(t.CityList,function(e){return a("mt-index-section",{key:e.index,attrs:{index:e.index}},t._l(e.list,function(t){return a("mt-cell",{key:t.id,attrs:{title:t.name}})}),1)}),1)],1)},staticRenderFns:[]};var r={name:"App",components:{"footer-bar":a("VU/8")({name:"FootBar",data:function(){return{selected:"main",img1:"static/home_selected.png",img3:"static/tool.png",img5:"static/user.png"}},computed:{isShow:function(){return!0}},watch:{selected:{handler:function(){"main"==this.selected?(this.$router.push("/main"),this.img1="static/home_selected.png"):this.img1="static/home.png","tool"==this.selected?(this.$router.push("/tool"),this.img3="static/tool_selected.png"):this.img3="static/tool.png","my"==this.selected?(this.$router.push("/my"),this.img5="static/user_selected.png"):this.img5="static/user.png"}}}},s,!1,function(t){a("XaYK")},"data-v-12d999fc",null).exports,"list-table":a("VU/8")({data:function(){return{CityList:[{index:"A",list:{id:"1",name:"北京",py:"beijing"}},{index:"B",list:{id:"2",name:"上海",py:"beijing"}},{index:"C",list:{id:"3",name:"广州",py:"beijing"}},{index:"D",list:{id:"4",name:"深圳",py:"beijing"}}]}}},i,!1,function(t){a("+cT6")},"data-v-6205a700",null).exports},computed:{}},l={render:function(){var t=this.$createElement,e=this._self._c||t;return e("div",{attrs:{id:"app"}},[e("div",{staticClass:"content-div"},[e("router-view")],1),this._v(" "),e("footer-bar",{staticClass:"footer"})],1)},staticRenderFns:[]};var o=a("VU/8")(r,l,!1,function(t){a("55LG")},null,null).exports,c=a("/ocq"),d=a("mtWM"),m=a.n(d),u={name:"queryUser",data:function(){return{username:"",password:"",age:"",sex:"",phone:"",address:"",nickName:"",id:""}},mounted:function(){var t=this;m.a.get("/muser/get/1").then(function(e){var a=e.data;console.log("result is:",a),t.username=a.data.username,t.password=a.data.password,t.age=a.data.age,t.sex=a.data.sex,t.phone=a.data.phone,t.address=a.data.address,t.nickName=a.data.nickName,t.id=a.data.id}).catch(function(t){alert("请求失败！！！")})}},p={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[a("el-table",{staticStyle:{width:"100%"}},[a("el-table-column",{attrs:{prop:"id",label:"ID",width:"80"}}),t._v(" "),a("el-table-column",{attrs:{prop:"username",label:"用户名",width:"80"}}),t._v(" "),a("el-table-column",{attrs:{prop:"nickName",label:"昵称"}}),t._v(" "),a("el-table-column",{attrs:{prop:"password",label:"密码",width:"80"}}),t._v(" "),a("el-table-column",{attrs:{prop:"age",label:"年龄",width:"80"}}),t._v(" "),a("el-table-column",{attrs:{prop:"sex",label:"性别"}}),t._v(" "),a("el-table-column",{attrs:{prop:"phone",label:"电话",width:"80"}}),t._v(" "),a("el-table-column",{attrs:{prop:"address",label:"住址",width:"80"}})],1),t._v(" "),a("el-table",{staticStyle:{width:"100%"}},[a("el-table-column",{attrs:{width:"80"}},[t._v(t._s(t.id))]),t._v(" "),a("el-table-column",{attrs:{width:"80"}},[t._v(t._s(t.username))]),t._v(" "),a("el-table-column",{attrs:{width:"80"}},[t._v(t._s(t.nickName))]),t._v(" "),a("el-table-column",{attrs:{width:"80"}},[t._v(t._s(t.password))]),t._v(" "),a("el-table-column",{attrs:{width:"80"}},[t._v(t._s(t.age))]),t._v(" "),a("el-table-column",{attrs:{width:"80"}},[t._v(t._s(t.sex))]),t._v(" "),a("el-table-column",{attrs:{width:"80"}},[t._v(t._s(t.phone))]),t._v(" "),a("el-table-column",{attrs:{width:"80"}},[t._v(t._s(t.address))])],1)],1)},staticRenderFns:[]};a("VU/8")(u,p,!1,function(t){a("HKdZ")},"data-v-552ba2c2",null).exports;var v={data:function(){return{username:"",password:"",age:"",sex:"",phone:"",address:"",nickName:"",id:"",items:[{title:"jjp",href:"http://google.com",url:"http://localhost:8088/static/poster01.png"},{title:"tool",href:"http://baidu.com",url:"http://localhost:8088/static/poster02.png"},{title:"order",href:"http://google.com",url:"http://localhost:8088/static/poster03.png"},{title:"user",href:"http://baidu.com",url:"http://localhost:8088/static/poster04.png"}]}},mounted:function(){var t=this;m.a.get("/muser/get/1").then(function(e){var a=e.data;console.log("result is:",a),t.username=a.data.username,t.password=a.data.password,t.age=a.data.age,t.sex=a.data.sex,t.phone=a.data.phone,t.address=a.data.address,t.nickName=a.data.nickName,t.id=a.data.id}).catch(function(t){alert("请求失败！！！")})}},h={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[a("mt-header",{attrs:{fixed:"",title:"首页"}}),t._v(" "),a("mt-swipe",{attrs:{auto:2e3}},t._l(t.items,function(e){return a("mt-swipe-item",{key:e.id},[a("a",{attrs:{href:e.href,rel:"external nofollow"}},[a("img",{staticClass:"img",attrs:{src:e.url}}),t._v(" "),a("span",{staticClass:"desc"})])])}),1),t._v(" "),a("div",{staticClass:"content"},[a("mt-cell",{attrs:{title:"id"}},[a("span",[t._v(t._s(t.id))])]),t._v(" "),a("mt-cell",{attrs:{title:"用户名"}},[a("span",[t._v(t._s(t.username))])]),t._v(" "),a("mt-cell",{attrs:{title:"昵称"}},[a("span",[t._v(t._s(t.nickName))])]),t._v(" "),a("mt-cell",{attrs:{title:"性别"}},[a("span",[t._v(t._s(t.sex))])]),t._v(" "),a("mt-cell",{attrs:{title:"年龄"}},[a("span",[t._v(t._s(t.age))])]),t._v(" "),a("mt-cell",{attrs:{title:"密码"}},[a("span",[t._v(t._s(t.password))])]),t._v(" "),a("mt-cell",{attrs:{title:"电话"}},[a("span",[t._v(t._s(t.phone))])]),t._v(" "),a("mt-cell",{attrs:{title:"住址"}},[a("span",[t._v(t._s(t.address))])])],1)],1)},staticRenderFns:[]};var _=a("VU/8")(v,h,!1,function(t){a("tFnC")},"data-v-2b0051e8",null).exports,f={render:function(){var t=this.$createElement;return(this._self._c||t)("div",{attrs:{id:"index"}},[this._v("\n  这里是应用中心22222\n")])},staticRenderFns:[]};var b=a("VU/8")({name:"tool"},f,!1,function(t){a("t2fY")},"data-v-1ce02751",null).exports,g={render:function(){var t=this.$createElement;return(this._self._c||t)("div",{attrs:{id:"index"}},[this._v("\n  这里是 我的界面1111\n\n\n")])},staticRenderFns:[]};var w=a("VU/8")({name:"my"},g,!1,function(t){a("x5bC")},"data-v-8488279c",null).exports;n.default.use(c.a);var x=new c.a({routes:[{path:"/",name:"main.vue",component:_},{path:"/main",name:"main.vue",component:_},{path:"/tool",name:"tool.vue",component:b},{path:"/my",name:"my.vue",component:w}]}),y=a("zL8q"),C=a.n(y),S=a("Au9i"),k=a.n(S);a("d8/S");n.default.component(S.Swipe.name,S.Swipe),n.default.component(S.SwipeItem.name,S.SwipeItem),n.default.prototype.$axios=m.a,n.default.config.productionTip=!1,n.default.component(S.Navbar.name,S.Navbar),n.default.component(S.TabItem.name,S.TabItem),n.default.component(S.IndexList.name,S.IndexList),n.default.component(S.IndexSection.name,S.IndexSection),n.default.component(S.Cell.name,S.Cell),n.default.component(S.Search.name,S.Search),n.default.use(m.a),n.default.use(C.a),n.default.use(k.a),new n.default({el:"#app",router:x,render:function(t){return t(o)}})},XaYK:function(t,e){},"d8/S":function(t,e){},t2fY:function(t,e){},tFnC:function(t,e){},x5bC:function(t,e){}},["NHnr"]);
//# sourceMappingURL=app.c9730cabd50c0845b541.js.map