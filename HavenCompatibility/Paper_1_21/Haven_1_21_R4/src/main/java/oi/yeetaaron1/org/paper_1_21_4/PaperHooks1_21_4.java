package oi.yeetaaron1.org.paper_1_21_4;

import oi.yeetaaron1.org.PaperHooks;
import net.minecraft.SharedConstants;
import org.slf4j.Logger;

public class PaperHooks1_21_4 implements PaperHooks {
  @Override
  public void doSomething(final Logger logger) {
    logger.info(SharedConstants.getCurrentVersion().getName());
  }
}
