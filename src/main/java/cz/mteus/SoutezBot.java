
package cz.mteus;

import net.dv8tion.jda.api.JDABuilder;


String token = System.getenv("DISCORD_TOKEN");
JDABuilder.createDefault(token).build();
