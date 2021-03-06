package org.yp.state.state2;

/**
 * Created by yipeng on 2014/7/15.
 */
public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("Please not vote repeated ,Thanks");
        Integer voteCount = voteManager.getVoteCountMap().get(user);
        if(voteCount == 5){
            voteManager.getVoteStateMap().put(user,new SpiteVoteState());
        }
    }
}
