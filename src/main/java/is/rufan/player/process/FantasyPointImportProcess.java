package is.rufan.player.process;


import is.rufan.player.domain.Player;
import is.rufan.player.service.PlayerService;
import is.rufan.player.service.PlayerServiceException;
import is.ruframework.process.RuAbstractProcess;
import is.ruframework.reader.RuReadHandler;
import is.ruframework.reader.RuReader;
import is.ruframework.reader.RuReaderException;
import is.ruframework.reader.RuReaderFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.logging.Logger;
/**
 * Created by eysteinn on 25/10/15.
 */
public class FantasyPointImportProcess extends  RuAbstractProcess implements RuReadHandler {
    private PlayerService playerService;
    @Override
    public void startProcess() {

    }

    public void read(int i, Object o) {

    }
}
