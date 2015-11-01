package de.alpharogroup.dating.system.domain;

import java.util.Date;

import de.alpharogroup.dating.system.enums.FriendshipRequestsState;
import de.alpharogroup.db.domain.BaseBusinessObject;
import de.alpharogroup.user.management.domain.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper=true)
@EqualsAndHashCode(callSuper=true)
public class FriendshipRequest extends BaseBusinessObject<Integer> {
	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	/** Field mapping */
	private User requestedUser;	
	/** Field mapping */
	private FriendshipRequestsState state;	
	/** Field mapping */
	private User requestor;
	/** Shows the Date that the friendship is accepted. */
	private Date acceptedDate;
}
