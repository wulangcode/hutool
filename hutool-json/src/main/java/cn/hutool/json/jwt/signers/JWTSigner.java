/*
 * Copyright (c) 2023 looly(loolly@aliyun.com)
 * Hutool is licensed under Mulan PSL v2.
 * You can use this software according to the terms and conditions of the Mulan PSL v2.
 * You may obtain a copy of Mulan PSL v2 at:
 *          http://license.coscl.org.cn/MulanPSL2
 * THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND,
 * EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT,
 * MERCHANTABILITY OR FIT FOR A PARTICULAR PURPOSE.
 * See the Mulan PSL v2 for more details.
 */

package cn.hutool.json.jwt.signers;

/**
 * JWT签名接口封装，通过实现此接口，完成不同算法的签名功能
 *
 * @author looly
 */
public interface JWTSigner {

	/**
	 * 签名
	 *
	 * @param headerBase64  JWT头的JSON字符串的Base64表示
	 * @param payloadBase64 JWT载荷的JSON字符串Base64表示
	 * @return 签名结果Base64，即JWT的第三部分
	 */
	String sign(String headerBase64, String payloadBase64);

	/**
	 * 验签
	 *
	 * @param headerBase64  JWT头的JSON字符串Base64表示
	 * @param payloadBase64 JWT载荷的JSON字符串Base64表示
	 * @param signBase64    被验证的签名Base64表示
	 * @return 签名是否一致
	 */
	boolean verify(String headerBase64, String payloadBase64, String signBase64);

	/**
	 * 获取算法
	 *
	 * @return 算法
	 */
	String getAlgorithm();

	/**
	 * 获取算法ID，即算法的简写形式，如HS256
	 *
	 * @return 算法ID
	 * @since 5.7.2
	 */
	default String getAlgorithmId() {
		return AlgorithmUtil.getId(getAlgorithm());
	}
}
