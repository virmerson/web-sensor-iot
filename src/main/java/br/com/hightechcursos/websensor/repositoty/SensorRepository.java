package br.com.hightechcursos.websensor.repositoty;

import br.com.hightechcursos.websensor.model.SensorData;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Virmerson Bento dos Santos on 11/3/16.
 */
public interface SensorRepository extends MongoRepository<SensorData, String>{

    public SensorData findByNumberIdentify(String numberIdentify);
}
