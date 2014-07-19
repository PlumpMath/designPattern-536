package org.yp.state.state2;

/**
 * Created by yipeng on 2014/7/15.
 */
public class Main {
    public static void main(String[] args){
        VoteManager vm = new VoteManager();
        for (int i = 0; i < 9; i++) {
            vm.vote("Joe","A");
        }
    }
}
