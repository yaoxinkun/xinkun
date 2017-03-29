/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE or an SAP affiliate company.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.xinkun.b2b.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.xinkun.b2b.fulfilmentprocess.constants.Xinkunb2bFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class Xinkunb2bFulfilmentProcessManager extends GeneratedXinkunb2bFulfilmentProcessManager
{
	public static final Xinkunb2bFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Xinkunb2bFulfilmentProcessManager) em.getExtension(Xinkunb2bFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
