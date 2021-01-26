package robot;

import java.io.Serializable;

import javax.persistence.*;


@Table(name = "robot")
@Entity
public class RobotEntity implements Serializable {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "weight")
    private Long weight;
    
    @Column(name = "switched_on")
    private Boolean switchedOn;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getWeight() {
		return weight;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}

	public Boolean getSwitchedOn() {
		return switchedOn;
	}

	public void setSwitchedOn(Boolean switchedOn) {
		this.switchedOn = switchedOn;
	}

	/*
	
	@Embedded
    private Description description;
	
	public Description getDescription() {
		return description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	public static class Description {

        @Column(name = "description_id")
        Long id;

        @Column(name = "description_label")
        String label;

        public Description() { }

        public Description(Long id, String label) {
            this.id = id;
            this.label = label;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }
    }
	
	public String describeRobot() {
        return String.format("name: %s, \n ID: %s \n SwitchedOn: %s",
                this.name,
                this.id,
                this.switchedOn
        );
    }*/

}
