/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *  *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *  *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.dating.system.enums;

/**
 * The Enum ApplicationRoles.
 */
public enum ApplicationRoles {

	/** The public. */
	PUBLIC(ApplicationRoles.PUBLIC_ROLE),
	/** The member. */
	MEMBER(ApplicationRoles.MEMBER_ROLE), 
	/** The premium member. */
	PREMIUM_MEMBER(ApplicationRoles.PREMIUM_MEMBER_ROLE),
	/** The root. */
	ROOT(ApplicationRoles.ROOT_ROLE);
	
	/** The Constant ROOT_ROLE. */
	private static final String ROOT_ROLE = "root";
	/** The Constant PROVIDER_ROLE. */
	private static final String MEMBER_ROLE = "member";
	
	/** The Constant SUBSCRIBER_ROLE. */
	private static final String PREMIUM_MEMBER_ROLE = "premium_member";

	/** The Constant PUBLIC_ROLE. */
	private static final String PUBLIC_ROLE = "public";
	/** The rolename. */
	private final String rolename;

	/**
	 * Instantiates a new application roles.
	 * 
	 * @param rolename
	 *            the rolename
	 */
	private ApplicationRoles(String rolename) {
		this.rolename = rolename;
	}

	/**
	 * Gets the rolename.
	 * 
	 * @return the rolename
	 */
	public String getRolename() {
		return rolename;
	}

}
