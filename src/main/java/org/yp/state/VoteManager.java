package org.yp.state;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yipeng on 2014/7/15.
 * voteManage相当于state模式中的context上下文，这种是在上下文中处理状态。
 */
public class VoteManager {
    private Map<String,String> voteMap = new HashMap<String, String>();
    private Map<String,Integer> voteCountMap = new HashMap<String, Integer>();
    private VoteState voteState;
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
        if(oldCount == 1){
            voteState = new NormalVoteState();
        }else if(oldCount >1 && oldCount <= 5){
            voteState = new RepeatVoteState();
        }else if(oldCount >5 && oldCount <= 8){
            voteState = new SpiteVoteState();
        }else if(oldCount >8){
            voteState = new BlockVoteState();
        }

        voteState.vote(user,voteItem,this);
    }
}
