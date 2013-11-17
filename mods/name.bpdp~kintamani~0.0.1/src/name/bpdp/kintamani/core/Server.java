package name.bpdp.kintamani.core;

import java.util.List;

import org.vertx.java.core.Handler;
import org.vertx.java.core.net.NetSocket;
import org.vertx.java.core.streams.Pump;
import org.vertx.java.platform.Verticle;
import org.vertx.java.core.http.*;

import ws.prova.api2.*;
import ws.prova.exchange.*;

public class Server extends Verticle {

	public void start() {

		HttpServer server = vertx.createHttpServer();

		RouteMatcher routeMatcher = new RouteMatcher();

		String kAgent = "prova";
		String kPort = null;
 
		String rulebase = "rules/test001.prova";
		int[] numSolutions = new int[] {2};

		ProvaCommunicator prova = new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		final List<ProvaSolution[]> solutions = prova.getInitializationSolutions();

		routeMatcher.get("/rulesinaction", new Handler<HttpServerRequest>() {
			public void handle(HttpServerRequest req) {
    		req.response().end("hasyu");
    		// req.response().end(solutions);
	    }
		});

		server.requestHandler(routeMatcher).listen(8080, "localhost");

	}

};

