package Patient.information;

import Patient.information.request.InformationCreateRequest;
import Patient.information.request.InformationUpdateRequest;
import Patient.information.response.InformationDeleteResquest;
import Patient.information.response.InformationResponse;
import Patient.information.response.InformationUpdateResponse;
import Patient.information.response.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class PatientController {

    @GetMapping("/patient")
    public List<InformationResponse> getpatient(){
        List<InformationResponse> patient = List.of(
                new InformationResponse(1, "simamura", 31, "男性", "デスクワーク"),
                new InformationResponse(2, "tamaki", 25, "女性", "看護師"),
                new InformationResponse(3, "chinen", 37, "女性", "事務"));
        return patient;//Get 取得処理
    }

    @PostMapping("/patient")
    public ResponseEntity<Response> createpatient(@RequestBody InformationCreateRequest informationCreateRequest, UriComponentsBuilder uriComponentsBuilder){
        //登録処理を呼び出す

        URI uri = uriComponentsBuilder.path("/patient/{id}").buildAndExpand(7).toUri();
        return ResponseEntity.created(uri).body(new Response("a new name created!"));
    }

    @PatchMapping("/patient/{id}")
    public InformationUpdateResponse updatepatient(@PathVariable int id, @RequestBody InformationUpdateRequest informationUpdateRequest){
        //更新処理を呼び出す
        return new InformationUpdateResponse("a name is updated!");
    }
    @DeleteMapping("/patient/{id}")
    public InformationDeleteResquest deletepatient(@PathVariable int id){
        //更新データの削除処理
        return new InformationDeleteResquest("a name is removed!");
    }
}
