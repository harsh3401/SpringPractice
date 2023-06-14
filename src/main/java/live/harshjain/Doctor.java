package live.harshjain;

public class Doctor implements Staff {
    private String qualifications;
    public void assist()
    {
        System.out.println("You are being treated");
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }
}
