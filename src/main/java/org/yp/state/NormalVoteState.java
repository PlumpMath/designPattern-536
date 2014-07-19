package org.yp.state;

/**
 * Created by yipeng on 2014/7/15.
 */
public class NormalVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("congratulations,You vote success");
    }
}
