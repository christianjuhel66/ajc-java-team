package ajc.tourisme.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "site")
public class Site {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nom;
	
	@Column
	private double longitude;
	
	@Column
	private double latitude;
	
	@Column
	private String type;
	
	@OneToOne
	@JoinColumn(name = "image_id")
	private Image image;

	public Site(String nom, double longitude, double latitude, String type, Image image) {
		this.nom = nom;
		this.longitude = longitude;
		this.latitude = latitude;
		this.type = type;
		this.image = image;
	}

	public Site(String nom, double longitude, double latitude, String type) {
		this.nom = nom;
		this.longitude = longitude;
		this.latitude = latitude;
		this.type = type;
	}
	
	
	
}
