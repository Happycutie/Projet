package uk.ac.rgu.cm2115;

import java.util.ArrayList;
import java.util.List;

public class RewardAccount {
    private List<String> rewards;

    public RewardAccount() {
        rewards = new ArrayList<>();
    }

    public void addReward(String reward) {
        rewards.add(reward);
    }

    public List<String> getRewards() {
        return rewards;
    }
}
