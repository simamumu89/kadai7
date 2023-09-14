package Patient.information;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {

    @GetMapping("/patient")
    public List<InfromationResponse> getpatient(){
        List<InfromationResponse> patient = List.of(
                new InfromationResponse(1, "simamura", 31, "男性", "デスクワーク"),
                new InfromationResponse(2, "tamaki", 25, "女性", "看護師"),
                new InfromationResponse(3, "chinen", 37, "女性", "事務"));
        return patient;//Get 取得処理
    }

    @PostMapping("/patient")
    public Response create(){
        return new Response("created a new infromation")
    }
}
