package freeCodeCamp_Java20;

public enum Level {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private int levelNum;

  private Level(int num) {
        this.levelNum = num;
    }
    public int getLvl() {
      return this.levelNum;
    }

    public void setLvl(int num) {
      this.levelNum = num;
    }
}
