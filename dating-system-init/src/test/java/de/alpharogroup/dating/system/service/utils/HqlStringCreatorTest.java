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

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import de.alpharogroup.dating.system.entities.UserProfiles;
import de.alpharogroup.dating.system.enums.FriendshipRequestsState;
import de.alpharogroup.user.entities.Users;

public class HqlStringCreatorTest {

	@Test(enabled = true)
	public void testForFavoriteMembers() {
		String actual;
		String expected;
		actual = HqlStringCreator.forFavoriteMembers(new Users(), new UserProfiles());
		expected = "select fm from FavoriteMembers fm where fm.owner=:owner and fm.favorite=:favorite";
		AssertJUnit.assertEquals(expected, actual);

		actual = HqlStringCreator.forFavoriteMembers(new Users(), null);
		expected = "select fm from FavoriteMembers fm where fm.owner=:owner";
		AssertJUnit.assertEquals(expected, actual);

		actual = HqlStringCreator.forFavoriteMembers(null, new UserProfiles());
		expected = "select fm from FavoriteMembers fm where fm.favorite=:favorite";
		AssertJUnit.assertEquals(expected, actual);

		actual = HqlStringCreator.forFavoriteMembers(null, null);
		expected = "select fm from FavoriteMembers fm";
		AssertJUnit.assertEquals(expected, actual);
	}

	@Test(enabled = true)
	public void testForFriendshipRequests() {
		String actual;
		String expected;

		actual = HqlStringCreator.forFriendshipRequests(new Users(), new Users(), FriendshipRequestsState.ACCEPTED);
		expected = "select fr from FriendshipRequests fr where fr.requestor=:requestor and fr.requestedUser=:requestedUser and fr.state=:state";
		AssertJUnit.assertEquals(expected, actual);

		actual = HqlStringCreator.forFriendshipRequests(new Users(), new Users(), null);
		expected = "select fr from FriendshipRequests fr where fr.requestor=:requestor and fr.requestedUser=:requestedUser";
		AssertJUnit.assertEquals(expected, actual);

		actual = HqlStringCreator.forFriendshipRequests(null, new Users(), null);
		expected = "select fr from FriendshipRequests fr where fr.requestedUser=:requestedUser";
		AssertJUnit.assertEquals(expected, actual);

		actual = HqlStringCreator.forFriendshipRequests(new Users(), null, null);
		expected = "select fr from FriendshipRequests fr where fr.requestor=:requestor";
		AssertJUnit.assertEquals(expected, actual);

		actual = HqlStringCreator.forFriendshipRequests(null, null, null);
		expected = "select fr from FriendshipRequests fr";
		AssertJUnit.assertEquals(expected, actual);

		actual = HqlStringCreator.forFriendshipRequests(null, new Users(), FriendshipRequestsState.ACCEPTED);
		expected = "select fr from FriendshipRequests fr where fr.requestedUser=:requestedUser and fr.state=:state";
		AssertJUnit.assertEquals(expected, actual);

		actual = HqlStringCreator.forFriendshipRequests(new Users(), null, FriendshipRequestsState.ACCEPTED);
		expected = "select fr from FriendshipRequests fr where fr.requestor=:requestor and fr.state=:state";
		AssertJUnit.assertEquals(expected, actual);

		actual = HqlStringCreator.forFriendshipRequests(null, null, FriendshipRequestsState.ACCEPTED);
		expected = "select fr from FriendshipRequests fr where fr.state=:state";
		AssertJUnit.assertEquals(expected, actual);
	}

	@Test(enabled = true)
	public void testForProfileNotice() {
		String actual;
		String expected;
		actual = HqlStringCreator.forProfileNotice(new Users(), new UserProfiles());
		expected = "select pr from ProfileNotices pr where pr.user=:user and pr.userProfile=:userProfile";
		AssertJUnit.assertEquals(expected, actual);

		actual = HqlStringCreator.forProfileNotice(new Users(), null);
		expected = "select pr from ProfileNotices pr where pr.user=:user";
		AssertJUnit.assertEquals(expected, actual);

		actual = HqlStringCreator.forProfileNotice(null, new UserProfiles());
		expected = "select pr from ProfileNotices pr where pr.userProfile=:userProfile";
		AssertJUnit.assertEquals(expected, actual);

		actual = HqlStringCreator.forProfileNotice(null, null);
		expected = "select pr from ProfileNotices pr";
		AssertJUnit.assertEquals(expected, actual);
	}

}
