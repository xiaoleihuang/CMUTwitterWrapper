from py4j.java_gateway import JavaGateway
#from py4j.java_gateway import GatewayParameters

#gateway = JavaGateway(gateway_parameters=GatewayParameters(auto_field=True))
gateway = JavaGateway()
parserwrapper = gateway.entry_point.getParserWrapper()
test  = parserwrapper.parse1tweet('RT @DjBlack_Pearl: wat muhfuckaz wearin 4 the lingerie party?????')

print(len(test))
# have to get access to value by calling methods
print(test[5].getKey() + "\t" + test[5].getValue())

tokenizerwrapper = gateway.entry_point.getTokenizerWrapper()
test = tokenizerwrapper.tokenizesSimpleTweet('RT @DjBlack_Pearl: wat muhfuckaz wearin 4    the lingerie party?????')
print(len(test))
print(test)
