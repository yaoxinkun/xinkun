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
package com.xinkun.b2b.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.xinkun.b2b.core.constants.Xinkunb2bCoreConstants;
import com.xinkun.b2b.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
@SuppressWarnings("PMD")
public class Xinkunb2bCoreManager extends GeneratedXinkunb2bCoreManager
{
	public static final Xinkunb2bCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Xinkunb2bCoreManager) em.getExtension(Xinkunb2bCoreConstants.EXTENSIONNAME);
	}
}
