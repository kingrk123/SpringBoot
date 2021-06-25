package in.nit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Vendor {
   @Id
   private Integer venId; //ven_id
   private String venName; //ven_name
   private String venAddr; //ven_addr
   private String venCode; //ven_code
}
