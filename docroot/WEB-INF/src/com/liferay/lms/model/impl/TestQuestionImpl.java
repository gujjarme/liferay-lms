/**
 * Copyright (c)2013 Telefonica Learning Services. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.lms.model.impl;

import com.liferay.lms.learningactivity.questiontype.QuestionType;
import com.liferay.lms.learningactivity.questiontype.QuestionTypeRegistry;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model implementation for the TestQuestion service. Represents a row in the &quot;Lms_TestQuestion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.lms.model.TestQuestion} interface.
 * </p>
 *
 * @author TLS
 */
public class TestQuestionImpl extends TestQuestionBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a test question model instance should use the {@link com.liferay.lms.model.TestQuestion} interface instead.
	 */
	public TestQuestionImpl() {
	}
	
	public QuestionType getTestQuestionType(){
		QuestionType qt = null;
		try {
			qt = new QuestionTypeRegistry().getQuestionType(getQuestionType());
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return qt;
	}
	
}