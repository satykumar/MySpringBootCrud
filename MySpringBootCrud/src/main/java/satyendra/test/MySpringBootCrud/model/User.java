package satyendra.test.MySpringBootCrud.model;

import java.time.Instant;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user_configuration")
public class User {

    @Id
    private Long id;
    
    private String fname;
    
    private String lName;
    
    private List<Addres> addres;

    private String email;
    
    private Boolean isLock;
    
    private Boolean isEnable;
    
    @Version
    private Long version;
    @CreatedDate
    private Instant createdUTC;
    
    @LastModifiedDate
    private Instant updatedUTC;

    public User() {

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public List<Addres> getAddres() {
        return addres;
    }

    public void setAddres(List<Addres> addres) {
        this.addres = addres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsLock() {
        return isLock;
    }

    public void setIsLock(Boolean isLock) {
        this.isLock = isLock;
    }

    public Boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Instant getCreatedUTC() {
        return createdUTC;
    }

    public void setCreatedUTC(Instant createdUTC) {
        this.createdUTC = createdUTC;
    }

    public Instant getUpdatedUTC() {
        return updatedUTC;
    }

    public void setUpdatedUTC(Instant updatedUTC) {
        this.updatedUTC = updatedUTC;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", fname=" + fname + ", lName=" + lName + ", addres=" + addres + ", email=" + email
                + ", isLock=" + isLock + ", isEnable=" + isEnable + ", version=" + version + ", createdUTC="
                + createdUTC + ", updatedUTC=" + updatedUTC + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((addres == null) ? 0 : addres.hashCode());
        result = prime * result + ((createdUTC == null) ? 0 : createdUTC.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((fname == null) ? 0 : fname.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((isEnable == null) ? 0 : isEnable.hashCode());
        result = prime * result + ((isLock == null) ? 0 : isLock.hashCode());
        result = prime * result + ((lName == null) ? 0 : lName.hashCode());
        result = prime * result + ((updatedUTC == null) ? 0 : updatedUTC.hashCode());
        result = prime * result + ((version == null) ? 0 : version.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (addres == null) {
            if (other.addres != null)
                return false;
        } else if (!addres.equals(other.addres))
            return false;
        if (createdUTC == null) {
            if (other.createdUTC != null)
                return false;
        } else if (!createdUTC.equals(other.createdUTC))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (fname == null) {
            if (other.fname != null)
                return false;
        } else if (!fname.equals(other.fname))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (isEnable == null) {
            if (other.isEnable != null)
                return false;
        } else if (!isEnable.equals(other.isEnable))
            return false;
        if (isLock == null) {
            if (other.isLock != null)
                return false;
        } else if (!isLock.equals(other.isLock))
            return false;
        if (lName == null) {
            if (other.lName != null)
                return false;
        } else if (!lName.equals(other.lName))
            return false;
        if (updatedUTC == null) {
            if (other.updatedUTC != null)
                return false;
        } else if (!updatedUTC.equals(other.updatedUTC))
            return false;
        if (version == null) {
            if (other.version != null)
                return false;
        } else if (!version.equals(other.version))
            return false;
        return true;
    }

    
}
