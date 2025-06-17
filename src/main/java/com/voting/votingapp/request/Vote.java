package com.voting.votingapp.request;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Vote {
    private Long pollId;
    private int optionIndex;
}
