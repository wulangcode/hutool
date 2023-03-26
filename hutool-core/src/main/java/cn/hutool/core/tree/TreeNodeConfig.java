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

package cn.hutool.core.tree;

import java.io.Serializable;

/**
 * 树配置属性相关
 *
 * @author liangbaikai
 */
public class TreeNodeConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 默认属性配置对象
	 */
	public static TreeNodeConfig DEFAULT_CONFIG = new TreeNodeConfig();

	// 属性名配置字段
	private String idKey = "id";
	private String parentIdKey = "parentId";
	private String weightKey = "weight";
	private String nameKey = "name";
	private String childrenKey = "children";
	// 可以配置递归深度 从0开始计算 默认此配置为空,即不限制
	private Integer deep;


	/**
	 * 获取ID对应的名称
	 *
	 * @return ID对应的名称
	 */
	public String getIdKey() {
		return this.idKey;
	}

	/**
	 * 设置ID对应的名称
	 *
	 * @param idKey ID对应的名称
	 * @return this
	 */
	public TreeNodeConfig setIdKey(final String idKey) {
		this.idKey = idKey;
		return this;
	}

	/**
	 * 获取权重对应的名称
	 *
	 * @return 权重对应的名称
	 */
	public String getWeightKey() {
		return this.weightKey;
	}

	/**
	 * 设置权重对应的名称
	 *
	 * @param weightKey 权重对应的名称
	 * @return this
	 */
	public TreeNodeConfig setWeightKey(final String weightKey) {
		this.weightKey = weightKey;
		return this;
	}

	/**
	 * 获取节点名对应的名称
	 *
	 * @return 节点名对应的名称
	 */
	public String getNameKey() {
		return this.nameKey;
	}

	/**
	 * 设置节点名对应的名称
	 *
	 * @param nameKey 节点名对应的名称
	 * @return this
	 */
	public TreeNodeConfig setNameKey(final String nameKey) {
		this.nameKey = nameKey;
		return this;
	}

	/**
	 * 获取子点对应的名称
	 *
	 * @return 子点对应的名称
	 */
	public String getChildrenKey() {
		return this.childrenKey;
	}

	/**
	 * 设置子点对应的名称
	 *
	 * @param childrenKey 子点对应的名称
	 * @return this
	 */
	public TreeNodeConfig setChildrenKey(final String childrenKey) {
		this.childrenKey = childrenKey;
		return this;
	}

	/**
	 * 获取父节点ID对应的名称
	 *
	 * @return 父点对应的名称
	 */
	public String getParentIdKey() {
		return this.parentIdKey;
	}


	/**
	 * 设置父点对应的名称
	 *
	 * @param parentIdKey 父点对应的名称
	 * @return this
	 */
	public TreeNodeConfig setParentIdKey(final String parentIdKey) {
		this.parentIdKey = parentIdKey;
		return this;
	}

	/**
	 * 获取递归深度
	 *
	 * @return 递归深度
	 */
	public Integer getDeep() {
		return this.deep;
	}

	/**
	 * 设置递归深度
	 *
	 * @param deep 递归深度
	 * @return this
	 */
	public TreeNodeConfig setDeep(final Integer deep) {
		this.deep = deep;
		return this;
	}
}
