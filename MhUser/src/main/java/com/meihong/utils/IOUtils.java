package com.meihong.utils;

import java.io.Closeable;
import java.io.IOException;

/**
 * IO��ع�����
 * @author tch
 * @date Oct 29, 2021
 */
public class IOUtils {

	/**
	 * �رն�������
	 * @param closeable
	 */
    public static void closeQuietly(final Closeable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (final IOException ioe) {
            // ignore
        }
    }
}