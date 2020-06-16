package JsonCwiczenia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class jsonZad3 {
    private String profileName;
    private Map<String,String> profileImage;



}
