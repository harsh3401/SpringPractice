package live.harshjain;

import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff {

    public void assist()
    {
        System.out.println("You are being treated");
    }

}
