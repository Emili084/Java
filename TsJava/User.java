// import { Address } from './address';
// import { Photo } from './photo';

// export class User {
//     birthdate: Date;
//     size: number;
//     photos: Photo[];
//     address: Address; 
// }

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private Date birthdate;
    private int size;
    private List<Photo> photos;
    private Adress adress;

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public Adress getAddress() {
        return adress;
    }

    public void setAddress(Adress adress) {
        this.adress = adress;
    }

    public static void main(String[] args) {
        User user = new User();
        user.setBirthdate(new Date());
        user.setSize(180);
        user.setPhotos(new ArrayList<>());
        user.setAddress(new Adress());

        System.out.println(user.getBirthdate());
        System.out.println(user.getSize());
        System.out.println(user.getPhotos());
        System.out.println(user.getAddress());
    }

}