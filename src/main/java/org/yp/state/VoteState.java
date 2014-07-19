package org.yp.state;

/**
 * Created by yipeng on 2014/7/15.
 */
public interface VoteState {
    void vote(String user,String voteItem,VoteManager voteManager);
}
