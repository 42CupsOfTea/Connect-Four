





public class joinFourMain {

    joinFourLogic joinFourCalculations = new joinFourLogic();



    int player = 2;

    joinFourMain() {
        boolean over = false;
        while (over == false) {
            int column = joinFourCalculations.getColumnNumber();
            joinFourCalculations.moveChipToCorrectPosition(joinFourCalculations.board, player,column);
            joinFourCalculations.connectFourLogicTempScreen();
            if (joinFourCalculations.hasPlayerWon(joinFourCalculations.board, player) == true) {
                over = true;
            }

            player = joinFourCalculations.changePlayer(player);
            
            
        }
        
    }

    // public boolean joinFourIsCooldownActive() {
    //     if (cooldown == true) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

    // public void joinFourChangeCooldown() {
    //     cooldown = true;
    // }
}
