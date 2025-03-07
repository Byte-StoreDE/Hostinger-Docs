                        // Create Payload for Status Packet.
                        JsonObject payloadIO = new JsonObject();

                        payloadIO.addProperty("id", virtualizedIO.getId().toString());
                        payloadIO.addProperty("type", "virtualized");
                        payloadIO.addProperty("status", "created");

                        // Define Data Packet.
                        JSONStatusMessage messageIO = new JSONStatusMessage(JSONStatus.SUCCESS, payloadIO);

                        // Fire Webhook.
                        webhookService.execute(VirtualizationService.class, "create", messageIO);