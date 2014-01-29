import name.bpdp.kintamani.core.*;

import java.util.List;

import org.vertx.java.core.Handler;
import org.vertx.java.core.net.NetSocket;
import org.vertx.java.core.streams.Pump;
import org.vertx.java.platform.Verticle;
import org.vertx.java.core.http.*;

import ws.prova.api2.*;
import ws.prova.exchange.*;

public class Prova extends Verticle {

	public void start() {

		HttpServer server = vertx.createHttpServer();

		RouteMatcher routeMatcher = new RouteMatcher();

		Server prv = new Server();

		final String provaResults = prv.getResults("rules/test017.prova");

		routeMatcher.get("/rulesinaction", new Handler<HttpServerRequest>() {
			public void handle(HttpServerRequest req) {
				req.response().end(provaResults);
	    }
		});

		server.requestHandler(routeMatcher).listen(8080, "localhost");

	}

};
