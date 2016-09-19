/**
 * Created by DELL on 01-Jun-16.
 */
public class gameRecords {

    private int _id;
    private String _playername;

    public gameRecords(){

    }

    public gameRecords(String playername){
        this._playername = playername;
    }

    public void set_id(int _id){
        this._id = _id;
    }

    public void set_playername(String _playername){
        this._playername = _playername;
    }

    public int get_id(){
        return _id;
    }

    public String get_playername(){
        return _playername;
    }

}
