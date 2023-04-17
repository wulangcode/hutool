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

package org.dromara.hutool.extra.expression.engine.aviator;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.AviatorEvaluatorInstance;
import org.dromara.hutool.core.func.SimpleWrapper;
import org.dromara.hutool.extra.expression.Expression;
import org.dromara.hutool.extra.expression.ExpressionEngine;

/**
 * Aviator引擎封装<br>
 * 见：<a href="https://github.com/killme2008/aviatorscript">https://github.com/killme2008/aviatorscript</a>
 *
 * @author looly
 */
public class AviatorEngine extends SimpleWrapper<AviatorEvaluatorInstance>
	implements ExpressionEngine {

	/**
	 * 构造
	 */
	public AviatorEngine() {
		super(AviatorEvaluator.getInstance());
	}

	@Override
	public Expression compile(final String expression) {
		return new AviatorExpression(this.raw.compile(expression));
	}
}