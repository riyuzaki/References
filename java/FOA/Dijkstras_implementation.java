import java.util.*;


public class Dijkstras_implementation{
private int cities;

private int  adjacencyMatrix[][];

private Set<Integer> finished;

private Set<Integer> notfinished;

private int  distances[];

public Dijkstras_implementation(int cities)

{

this.cities = cities;

distances = new int[cities + 1];

finished = new HashSet<Integer>();

notfinished = new HashSet<Integer>();

adjacencyMatrix = new int[cities + 1][cities + 1];

}

public int shortestAnswer(int adjacency_matrix[][], int source, int destination){

dijkstras_algorithm(adjacency_matrix, source);

return distances[destination];

}

public void dijkstras_algorithm(int adjacency_matrix[][], int source)

{
int leftNode;
for (int i = 1; i <= cities; i++)
for (int j = 1; j <= cities; j++)
adjacencyMatrix[i][j] = adjacency_matrix[i][j];


for (int i = 1; i <= cities; i++)

{

distances[i] = Integer.MAX_VALUE;

}



notfinished.add(source);

distances[source] = 0;

while (!notfinished.isEmpty())

{

leftNode = minimumDistanceFunction();

notfinished.remove(leftNode);

finished.add(leftNode);

evaluateNeighbours(leftNode);

}

}

public int minimumDistanceFunction()

{

int min;

int node = 0;



Iterator<Integer> iterator = notfinished.iterator();

node = iterator.next();

min = distances[node];

for (int i = 1; i <= distances.length; i++)

{

if (notfinished.contains(i))

{

if (distances[i] <= min)

{

min = distances[i];

node = i;

}

}

}

return node;

}

public void evaluateNeighbours(int leftNode)

{

int edgeDistance = -1;

int newDistance = -1;



for (int rightNode = 1; rightNode <= cities; rightNode++)

{
if (!finished.contains(rightNode))
{
if (adjacencyMatrix[leftNode][rightNode] != Integer.MAX_VALUE)
{
edgeDistance = adjacencyMatrix[leftNode][rightNode];

newDistance = distances[leftNode] + edgeDistance;

if (newDistance < distances[rightNode])
{
distances[rightNode] = newDistance;
}
notfinished.add(rightNode);

}

}

}

}

}
