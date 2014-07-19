package org.yp.state.state2;

/**
 * Created by yipeng on 2014/7/15.
 */
public class NormalVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        Integer voteCount = voteManager.getVoteCountMap().get(user);
        if(voteCount == 1){
            System.out.println("congratulations,You vote success");
        }
        voteManager.getVoteStateMap().put(user,new RepeatVoteState());
    }
}
