package JsonCwiczenia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class jsonZad4 {

    private String rodzaj;
    private Map<String, Double>[] punkty;
}
