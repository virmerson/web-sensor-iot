package br.com.hightechcursos.websensor.model;

import org.springframework.data.annotation.Id;

/**
 *
 * Created by Virmerson Bento dos Santos on 11/3/16.
 */
public class SensorData {

    @Id
    public String id; //dataBase, internal use

    public String numberIdentify; //physical component

    public String type;

    public String data;

    public SensorData() {
    }

    public SensorData(String numberIdentify, String type, String data) {

        this.numberIdentify = numberIdentify;
        this.type = type;
        this.data = data;
    }

    @Override
    public String toString() {
        return "SensorData{" +
                "id='" + id + '\'' +
                ", numberIdentify='" + numberIdentify + '\'' +
                ", type='" + type + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
