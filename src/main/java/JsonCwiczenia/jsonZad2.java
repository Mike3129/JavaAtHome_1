package JsonCwiczenia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class jsonZad2 {

    private Map<String, String> product;
    private double quantity;
    private double sum;


}
