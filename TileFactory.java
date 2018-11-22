
/**
 *
 * @author R. Springer
 */
public class TileFactory {

    /**
     * Creates a Tile object based on the mapIcon number you give
     *
     * @param mapIcon number
     * @return Tile tile object
     */
    public static Tile createTile(int mapIcon) {
        Tile tile;
        switch (mapIcon) {
            case 0:
                tile = new Tile("box.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 1:
                tile = new Tile("boxItem.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 2:
                tile = new Tile("boxCoin.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 3:
                tile = new Tile("boxExplosive.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 4:
                tile = new Tile("boxAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 5:
                tile = new Tile("grassCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);      
                tile.isSolid = true;
                break;
            case 6:
                tile = new Tile("bridgeLogs.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.getImage().mirrorVertically();
                tile.isSolid = true;
                break;
            case 7:
                tile = new Tile("grassRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 8:
                tile = new Tile("grassLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 9:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 10:
                tile = new Tile("liquidWater.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 11:
                tile = new Death("liquidWaterTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 12:
                tile = new Tile("signExit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 13:
                tile = new Tile("signRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 14:
                tile = new Tile("signLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
                case 168:
                tile = new RedKey("keyRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
                case 75:
                tile = new Tile("grassCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 78:
                tile = new Tile("grassCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 100:
                tile = new Tile("lock_red.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 99:
                tile = new Tile("lock_green.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 169:
                tile = new Tile("keyGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
                case 87:
                tile = new Tile("grassHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 81:
                tile = new Tile("grassHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 80:
                tile = new Tile("grassHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 85:
                tile = new Tile("grassHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 175:
                tile = new Tile("flyFly1.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
                case 176:
                tile = new Tile("flyFly2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
                case 173:
                tile = new Tile("slimeWalk1.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
                case 174:
                tile = new Tile("slimeWalk2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
                case 171:
                tile = new Star("star.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
                case 27:
                tile = new Tile("castleCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 30:
                tile = new Tile("castle.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 35:
                tile = new Tile("castleCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 37:
                tile = new Tile("castleCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 79:
                tile = new Tile("grassHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 82:
                tile = new Tile("grassHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 83:
                tile = new Tile("grassHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 84:
                tile = new Tile("grassHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 58:
                tile = new Tile("castleMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 170:
                tile = new BlueKey("keyBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
                case 77:
                tile = new Tile("grassCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 76:
                tile = new Tile("grassCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 98:
                tile = new Tile("lock_blue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 179:
                tile = new Death("spikes.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
                case 67:
                tile = new Tile("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
                case 68:
                tile = new Tile("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
                
                default:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
        }
        return tile;
    }
}
