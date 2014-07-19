package org.yp.state.state2;

/**
 * Created by yipeng on 2014/7/15.
 */
public class BlockVoteState implements VoteState{

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("你已经进入黑名单，将不能再登入");
    }
}
