package org.yp.state.state2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yipeng on 2014/7/15.
 * voteManage相当于state模式中的context上下文，这种是在各个状态中处理。
 */
public class VoteManager {
    private Map<String,String> voteMap = new HashMap<String, String>();
    private Map<String,Integer> voteCountMap = new HashMap<String, Integer>();
    private Map<String, VoteState> voteStateMap = new HashMap<String, VoteState>();

    public Map<String, VoteState> getVoteStateMap() {
        return voteStateMap;
    }

    public Map<String, String> getVoteMap() {
        return voteMap;
    }

    public Map<String, Integer> getVoteCountMap() {
        return voteCountMap;
    }

    public void vote(String user,String voteItem){
        Integer oldCount = voteCountMap.get(user);
        if(oldCount == null){
           oldCount = 0;
           voteMap.put(user,voteItem);
        }
        oldCount++;
        voteCountMap.put(user,oldCount);
        VoteState voteState = voteStateMap.get(user);
        if(voteState == null){
            voteState = new NormalVoteState();
            voteStateMap.put(user,voteState);
        }
        voteState.vote(user,voteItem,this);
    }
}
