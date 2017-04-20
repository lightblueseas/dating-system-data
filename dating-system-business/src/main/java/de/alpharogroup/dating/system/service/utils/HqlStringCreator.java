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
package de.alpharogroup.dating.system.service.utils;

import de.alpharogroup.dating.system.entities.FavoriteMembers;
import de.alpharogroup.dating.system.entities.FriendshipRequests;
import de.alpharogroup.dating.system.entities.ProfileNotices;
import de.alpharogroup.dating.system.entities.ProfileVisitors;
import de.alpharogroup.dating.system.entities.UserProfiles;
import de.alpharogroup.dating.system.enums.FriendshipRequestsState;
import de.alpharogroup.user.entities.Users;

public class HqlStringCreator
{

	public static String forFavoriteMembers(final Users owner, final UserProfiles favorite)
	{
		final StringBuilder sb = new StringBuilder();
		sb.append("select fm from " + FavoriteMembers.class.getSimpleName() + " fm");
		final boolean ownerIsNotNull = owner != null;
		if (ownerIsNotNull)
		{
			sb.append(" ");
			sb.append("where fm.owner=:owner");

		}
		final boolean favoriteIsNotNull = favorite != null;
		if (favoriteIsNotNull)
		{
			sb.append(" ");
			if (ownerIsNotNull)
			{
				sb.append("and fm.favorite=:favorite");
			}
			else
			{
				sb.append("where fm.favorite=:favorite");
			}
		}
		return sb.toString();
	}

	public static String forFriendshipRequests(final Users requestor, final Users requestedUser,
		final FriendshipRequestsState state)
	{
		final StringBuilder sb = new StringBuilder();
		sb.append("select fr from " + FriendshipRequests.class.getSimpleName() + " fr");
		final boolean requestorIsNotNull = requestor != null;
		if (requestorIsNotNull)
		{
			sb.append(" ");
			sb.append("where fr.requestor=:requestor");
		}
		final boolean requestedUserIsNotNull = requestedUser != null;
		if (requestedUserIsNotNull)
		{
			sb.append(" ");
			if (requestorIsNotNull)
			{
				sb.append("and fr.requestedUser=:requestedUser");
			}
			else
			{
				sb.append("where fr.requestedUser=:requestedUser");
			}
		}
		final boolean stateIsNotNull = state != null;
		if (stateIsNotNull)
		{
			sb.append(" ");
			if (!requestorIsNotNull && !requestedUserIsNotNull)
			{
				sb.append("where fr.state=:state");
			}
			else
			{
				sb.append("and fr.state=:state");
			}
		}
		return sb.toString();
	}

	public static String forProfileNotice(final Users user, final UserProfiles userProfile)
	{
		final StringBuilder sb = new StringBuilder();
		sb.append("select pr from " + ProfileNotices.class.getSimpleName() + " pr");
		final boolean ownerIsNotNull = user != null;
		if (ownerIsNotNull)
		{
			sb.append(" ");
			sb.append("where pr.user=:user");

		}
		final boolean favoriteIsNotNull = userProfile != null;
		if (favoriteIsNotNull)
		{
			sb.append(" ");
			if (ownerIsNotNull)
			{
				sb.append("and pr.userProfile=:userProfile");
			}
			else
			{
				sb.append("where pr.userProfile=:userProfile");
			}
		}
		return sb.toString();
	}

	public static String forProfileVisitors(final Users visitor, final UserProfiles visitedProfile)
	{
		final StringBuilder sb = new StringBuilder();
		sb.append("select pv from " + ProfileVisitors.class.getSimpleName() + " pv");
		final boolean ownerIsNotNull = visitor != null;
		if (ownerIsNotNull)
		{
			sb.append(" ");
			sb.append("where pv.visitor=:visitor");

		}
		final boolean favoriteIsNotNull = visitedProfile != null;
		if (favoriteIsNotNull)
		{
			sb.append(" ");
			if (ownerIsNotNull)
			{
				sb.append("and pv.visitedProfile=:visitedProfile");
			}
			else
			{
				sb.append("where pv.visitedProfile=:visitedProfile");
			}
		}
		return sb.toString();
	}

	public static String forUserProfile(final Users user)
	{
		final StringBuilder sb = new StringBuilder();
		sb.append("select pr from " + UserProfiles.class.getSimpleName() + " pr");
		final boolean userIsNotNull = user != null;
		if (userIsNotNull)
		{
			sb.append(" ");
			sb.append("where pr.user=:user");
		}
		return sb.toString();
	}

}
