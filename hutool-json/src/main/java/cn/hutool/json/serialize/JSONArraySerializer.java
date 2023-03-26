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

package cn.hutool.json.serialize;

import cn.hutool.json.JSONArray;

/**
 * JSON列表的序列化接口，用于将特定对象序列化为{@link JSONArray}
 *
 * @param <V> 对象类型
 *
 * @author Looly
 */
@FunctionalInterface
public interface JSONArraySerializer<V> extends JSONSerializer<JSONArray, V>{}
