package bibleandroid.apps.bereasoftware.org.databindandroid6; /**
 * Created by eparedes on 21/09/15.
 */
//
//

import android.databinding.BaseObservable;
import android.databinding.Bindable;


public class User extends BaseObservable{

    private String firstName;
    private String lastName;

    public User(String firstName) {
        this.firstName = firstName;
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }

    @Bindable
    public String getLastName(){ return this.lastName; }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(bibleandroid.apps.bereasoftware.org.databindandroid6.BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(bibleandroid.apps.bereasoftware.org.databindandroid6.BR.lastName);
    }

}

