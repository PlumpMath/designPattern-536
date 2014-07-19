package org.yp.state.state2;

/**
 * Created by yipeng on 2014/7/15.
 */
public class SpiteVoteState implements VoteState{
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("你有恶意刷票，已经取消了您的投票");
        String itemVote = voteManager.getVoteMap().get(user);
        if(itemVote != null){
            voteManager.getVoteMap().remove(user);
        }
        Integer voteCount = voteManager.getVoteCountMap().get(user);
        if(voteCount == 8){
            voteManager.getVoteStateMap().put(user,new BlockVoteState());
        }
    }
}
