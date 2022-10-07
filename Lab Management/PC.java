public class PC {
    private String assetID;
    private String name;
    private String LCDName;
    private int RAMSizeGB;
    private int DiskSizeGB;
    private boolean hasGraphicsCard;
    static int count = 0;

    public PC(String name, String LCDName, int RAMSizeGB, int DiskSizeGB, boolean hasGraphicsCard) {
        this.assetID = String.format("PC-%03d", count++);
        this.name = name;
        this.LCDName = LCDName;
        this.RAMSizeGB = RAMSizeGB;
        this.DiskSizeGB = DiskSizeGB;
        this.hasGraphicsCard = hasGraphicsCard;
    }

    public PC(PC other){
        this.assetID = String.format("PC-%03d", count++);
        this.name = other.getName();
        this.LCDName = other.getLCDName();
        this.RAMSizeGB = other.getRAMSizeGB();
        this.DiskSizeGB = other.getDiskSizeGB();
        this.hasGraphicsCard = other.gethasGraphicsCard();
    }

    public String getAssetID() {
        return assetID;
    }

    public int getDiskSizeGB() {
        return DiskSizeGB;
    }

    public String getLCDName() {
        return LCDName;
    }

    public boolean gethasGraphicsCard(){
        return hasGraphicsCard;
    }

    public String getName() {
        return name;
    }

    public int getRAMSizeGB() {
        return RAMSizeGB;
    }

    public void setDiskSizeGB(int diskSizeGB) {
        this.DiskSizeGB = diskSizeGB;
    }

    public void setHasGraphicsCard(boolean hasGraphicsCard) {
        this.hasGraphicsCard = hasGraphicsCard;
    }

    public void setLCDName(String lCDName) {
        LCDName = lCDName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRAMSizeGB(int rAMSizeMB) {
        RAMSizeGB = rAMSizeMB;
    }

    @Override
    public String toString() {
        return String.format("Asset ID: %s; Name: %s; LCDName: %s, RAMSize: %dGB; DiskSpace: %dGB", assetID, name, LCDName, RAMSizeGB, DiskSizeGB);
    }

    @Override
    public boolean equals(Object obj) {
        PC temp = (PC) obj;
        if (temp == null){
            return false;
        }
        return this.assetID.equals(temp.getAssetID());
    }

    @Override
    protected Object clone() {
        return new PC(this);
    }
}

