package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Board;

public class BoardList extends ArrayList {

  public Board findByNo(int no) {

    Object[] arr = toArray();

    for (Object obj : arr) {
      Board board = (Board) obj; // obj 형변환
      if (board.no == no) { 
        return board;
      }
    }
    return null;
  }
}











