/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.portal.kernel.service;

/**
 * Provides a wrapper for {@link LayoutSetService}.
 *
 * @author Brian Wing Shun Chan
 * @see LayoutSetService
 * @generated
 */
public class LayoutSetServiceWrapper
	implements LayoutSetService, ServiceWrapper<LayoutSetService> {

	public LayoutSetServiceWrapper(LayoutSetService layoutSetService) {
		_layoutSetService = layoutSetService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _layoutSetService.getOSGiServiceIdentifier();
	}

	/**
	 * Updates the state of the layout set prototype link.
	 *
	 * <p>
	 * <strong>Important:</strong> Setting
	 * <code>layoutSetPrototypeLinkEnabled</code> to <code>true</code> and
	 * <code>layoutSetPrototypeUuid</code> to <code>null</code> when the layout
	 * set prototype's current uuid is <code>null</code> will result in an
	 * <code>IllegalStateException</code>.
	 * </p>
	 *
	 * @param groupId the primary key of the group
	 * @param privateLayout whether the layout set is private to the group
	 * @param layoutSetPrototypeLinkEnabled whether the layout set prototype is
	 link enabled
	 * @param layoutSetPrototypeUuid the uuid of the layout set prototype to
	 link with
	 */
	@Override
	public void updateLayoutSetPrototypeLinkEnabled(
			long groupId, boolean privateLayout,
			boolean layoutSetPrototypeLinkEnabled,
			java.lang.String layoutSetPrototypeUuid)
		throws com.liferay.portal.kernel.exception.PortalException {

		_layoutSetService.updateLayoutSetPrototypeLinkEnabled(
			groupId, privateLayout, layoutSetPrototypeLinkEnabled,
			layoutSetPrototypeUuid);
	}

	@Override
	public void updateLogo(
			long groupId, boolean privateLayout, boolean hasLogo, byte[] bytes)
		throws com.liferay.portal.kernel.exception.PortalException {

		_layoutSetService.updateLogo(groupId, privateLayout, hasLogo, bytes);
	}

	@Override
	public void updateLogo(
			long groupId, boolean privateLayout, boolean hasLogo,
			java.io.File file)
		throws com.liferay.portal.kernel.exception.PortalException {

		_layoutSetService.updateLogo(groupId, privateLayout, hasLogo, file);
	}

	@Override
	public void updateLogo(
			long groupId, boolean privateLayout, boolean hasLogo,
			java.io.InputStream inputStream)
		throws com.liferay.portal.kernel.exception.PortalException {

		_layoutSetService.updateLogo(
			groupId, privateLayout, hasLogo, inputStream);
	}

	@Override
	public void updateLogo(
			long groupId, boolean privateLayout, boolean hasLogo,
			java.io.InputStream inputStream, boolean cleanUpStream)
		throws com.liferay.portal.kernel.exception.PortalException {

		_layoutSetService.updateLogo(
			groupId, privateLayout, hasLogo, inputStream, cleanUpStream);
	}

	@Override
	public com.liferay.portal.kernel.model.LayoutSet updateLookAndFeel(
			long groupId, boolean privateLayout, java.lang.String themeId,
			java.lang.String colorSchemeId, java.lang.String css)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _layoutSetService.updateLookAndFeel(
			groupId, privateLayout, themeId, colorSchemeId, css);
	}

	@Override
	public com.liferay.portal.kernel.model.LayoutSet updateSettings(
			long groupId, boolean privateLayout, java.lang.String settings)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _layoutSetService.updateSettings(
			groupId, privateLayout, settings);
	}

	/**
	 * @deprecated As of Mueller (7.2.x), replaced by {@link
	 #updateVirtualHosts(long, boolean, TreeMap)}
	 */
	@Deprecated
	@Override
	public com.liferay.portal.kernel.model.LayoutSet updateVirtualHost(
			long groupId, boolean privateLayout, java.lang.String virtualHost)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _layoutSetService.updateVirtualHost(
			groupId, privateLayout, virtualHost);
	}

	@Override
	public com.liferay.portal.kernel.model.LayoutSet updateVirtualHosts(
			long groupId, boolean privateLayout,
			java.util.TreeMap<java.lang.String, java.lang.String>
				virtualHostnames)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _layoutSetService.updateVirtualHosts(
			groupId, privateLayout, virtualHostnames);
	}

	@Override
	public LayoutSetService getWrappedService() {
		return _layoutSetService;
	}

	@Override
	public void setWrappedService(LayoutSetService layoutSetService) {
		_layoutSetService = layoutSetService;
	}

	private LayoutSetService _layoutSetService;

}